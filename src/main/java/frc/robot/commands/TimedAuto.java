// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class TimedAuto extends CommandBase {
  /** Creates a new TimedAuto. */
  private final Timer timer = new Timer();
  private final DriveTrain drive = new DriveTrain();
<<<<<<< HEAD
=======
  
>>>>>>> d86aa0f94e578c842e50bef039b2668cd85c3502
  public TimedAuto() {
    // Use addRequirements() here to declare subsystem dependencies.
    timer.reset();
    addRequirements(drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
<<<<<<< HEAD
    if (timer.get() < 2) drive.tankDrive(0.3,.3);
    else if (timer.get() < 4) drive.tankDrive(-0.3,-0.3);
=======
    if(timer.get() < 2){
      drive.tankDrive(0.3, 0.3);
    }
    else if(timer.get() < 3){
      drive.tankDrive(-0.3,-0.3);
    }
>>>>>>> d86aa0f94e578c842e50bef039b2668cd85c3502
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
<<<<<<< HEAD
=======
    if(timer.get() > 3){
      return true;
    }
>>>>>>> d86aa0f94e578c842e50bef039b2668cd85c3502
    return false;
  }
}
