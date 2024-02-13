// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.math.controller.PIDController;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;


import frc.robot.Constants;



public class PivotSubsystem extends SubsystemBase {
  public PIDController pivPID;
  public double desiredSpeed = 0.30;
  public CANSparkMax pivotMotor;
  public RelativeEncoder pivotEncoder;




  /** Creates a new PivotSubsystem. */
  public PivotSubsystem() {
  pivPID = new PIDController(0.1, 0, 0);
  pivotMotor = new CANSparkMax(Constants.PivotConstants.pivotMotorID, MotorType.kBrushless);
  pivotEncoder = pivotMotor.getEncoder();
  }

  public void PivotPID(double position) {

    pivotMotor.set(-pivPID.calculate(position,pivotMotor.getEncoder().getPosition()));
 
  }  public void resetEncoders() {

    pivotMotor.getEncoder().setPosition(0);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

