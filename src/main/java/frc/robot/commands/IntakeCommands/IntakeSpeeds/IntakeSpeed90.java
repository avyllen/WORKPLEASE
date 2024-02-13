// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.IntakeCommands.IntakeSpeeds;

import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;


/** An example command that uses an example subsystem. */
public class IntakeSpeed90 extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final IntakeSubsystem intakeSubsystem;
double intakeSpeed = 0.0;
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public IntakeSpeed90(IntakeSubsystem intakeSubsystem) {
    this.intakeSubsystem = intakeSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(intakeSubsystem);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("Intake Speed 90");

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    


    /*if (RobotContainer.xboxController.getAButton()) {
      shooterSpeed = 0.5;
    }
     else if (RobotContainer.xboxController.getBButton()){
       shooterSpeed = 0.7;
     } else if (RobotContainer.xboxController.getXButton()){
       shooterSpeed = 0.9;
    } else {
      shooterSpeed = 0;
    }*/
    
    intakeSubsystem.controlIntake(intakeSpeed);
    //testing



    }  

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

