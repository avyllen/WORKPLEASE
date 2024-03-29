// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
public class IntakeSubsystem extends SubsystemBase {

  /** Creates a new ExampleSubsystem. */
  //CANSparkMax BottomMotor = new CANSparkMax(Constants.DrivetrainConstants.BottomMotorCANID, CANSparkLowLevel.MotorType.kBrushless);
//CANSparkMax TopMotor = new CANSparkMax (Constants.DrivetrainConstants.TopMotorCANID, CANSparkLowLevel.MotorType.kBrushless);

TalonSRX TopMotor = new TalonSRX(Constants.DrivetrainConstants.TopMotorID);
TalonSRX BottomMotor = new TalonSRX(Constants.DrivetrainConstants.BottomMotorID);

PIDController pid = new PIDController(0.01, 0, 0);


//CANSparkMax PivotPoint = new CANSparkMax (Constants.DrivetrainConstants.LeftBackCANID, CANSparkLowLevel.MotorType.kBrushless);

// RelativeEncoder leftEncoder = LeftFrontMotor.getEncoder();
// RelativeEncoder rightEncoder = RightFrontMotor.getEncoder();

public void controlIntake(double intakeSpeed) {

  TopMotor.set(TalonSRXControlMode.PercentOutput, intakeSpeed);
}
{

   // TopMotor.set(ControlMode.PercentOutput, pid.calculate(TopMotor.getMotorOutputPercent()));

   // BottomMotor.set(ControlMode.PercentOutput, pid.calculate(BottomMotor.getSelectedSensorPosition(),intakeSpeed));

}


//DifferentialDrive differentialDrive = new DifferentialDrive(leftMotorControllerGroup, RightMotorControllerGroup);
  public IntakeSubsystem() {
 

  //PivotPoint.restoreFactoryDefaults();
  //LeftBackMotor.follow(LeftFrontMotor);
 


  }

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
  }


public void PIDControl(double intakePosition) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'PIDControl'");
}

//   @Override
//   public void simulationPeriodic() {
//     // This method will be called once per scheduler run during simulation
  //public void IntakewithJoystickCommand(double Speed1, double Speed2) {
    

   // BottomMotor.set(Speed1);
   // TopMotor.set(Speed2);

    
   public void setspeed(double speed1) {

  }
}
  
 