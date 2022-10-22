// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class DriveTrain extends SubsystemBase {
  
  //private final WPI_TalonSRX  _leftDriveTalon;
  //private final WPI_TalonSRX _rightDriveTalon;
  private double ticksToMeters = (127.0/10581.)/100.0;
  private WPI_TalonSRX left = new WPI_TalonSRX(Constants.leftPort);
  private WPI_TalonSRX right = new WPI_TalonSRX(Constants.rightPort);
  /** Creates a new DriveTrain. */
  public DriveTrain() {
    left.configFactoryDefault();
    right.configFactoryDefault();

    left.setInverted(true);
    right.setInverted(false);
  }
  public void tankDrive(double lPower, double rPower){
    left.set(ControlMode.PercentOutput, lPower);
    right.set(ControlMode.PercentOutput, rPower);
  }
  public double getPos() {
    return (left.getSelectedSensorPosition()+right.getSelectedSensorPosition()
    /2*ticksToMeters);
  } 
public void resetEncoders() {
  left.setSelectedSensorPosition(0, 0, 10);
  right.setSelectedSensorPosition(0, 0, 10);
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    tankDrive(RobotContainer.getJoy1().getY(), RobotContainer.getJoy2().getY());
  }
}
