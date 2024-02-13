// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


public class FeederSubsystem extends SubsystemBase {
/** Add your docs here. */
TalonSRX leftFeeder;
TalonSRX rightFeeder;

PIDController pid = new PIDController(0.1, 0, 0);

public FeederSubsystem() {
 leftFeeder  = new TalonSRX(Constants.FeederConstants.leftFeederID);
 rightFeeder  = new TalonSRX(Constants.FeederConstants.rightFeederID);
  }

//CANSparkMax PivotPoint = new CANSparkMax (Constants.DrivetrainConstants.LeftBackCANID, CANSparkLowLevel.MotorType.kBrushless);

// RelativeEncoder leftEncoder = LeftFrontMotor.getEncoder();
// RelativeEncoder rightEncoder = RightFrontMotor.getEncoder();

public void controlFeeder(double feederSpeed) {

    leftFeeder.set(TalonSRXControlMode.PercentOutput, feederSpeed);
    rightFeeder.set(TalonSRXControlMode.PercentOutput, feederSpeed);
}

public void FeederPID(double position){

   // leftFeeder.set(TalonSRXControlMode.PercentOutput, pid.calculate(leftFeeder.getMotorOutputPercent(),feederSpeed));
   // rightFeeder.set(TalonSRXControlMode.PercentOutput, pid.calculate(rightFeeder.getMotorOutputPercent(),feederSpeed));
    leftFeeder.set(TalonSRXControlMode.PercentOutput, pid.calculate(leftFeeder.getMotorOutputPercent()));
    rightFeeder.set(TalonSRXControlMode.PercentOutput, pid.calculate(rightFeeder.getMotorOutputPercent()));


}


//DifferentialDrive differentialDrive = new DifferentialDrive(leftMotorControllerGroup, RightMotorControllerGroup);
  

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Left Feeder Encoder", leftFeeder.getMotorOutputPercent());  
    SmartDashboard.putNumber("Right Feeder Encoder", rightFeeder.getMotorOutputPercent());
    
  }


public void PIDControl(double intakePosition) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'PIDControl'");
}


    

  }
  
 