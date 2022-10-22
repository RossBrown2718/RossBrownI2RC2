// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.nio.file.ProviderMismatchException;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class TurnAuto extends CommandBase {
  private   final   DriveTrain  _driveTrain;
  private           double      angle;
  /** Creates a new TurnAuto. */
  public TurnAuto(    DriveTrain  dt,   double  angle) {
    // Use addRequirements() here to declare subsystem dependencies.
    _driveTrain=dt
    ;this.angle=angle
    ;addRequirements(_driveTrain)
    ;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return  _driveTrain.getAngle()    <     angle?false:    true;
  }
}
