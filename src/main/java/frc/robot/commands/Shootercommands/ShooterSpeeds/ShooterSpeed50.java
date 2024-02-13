// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Shootercommands.ShooterSpeeds;

import frc.robot.subsystems.ShooterSubsystem;
import edu.wpi.first.wpilibj2.command.Command;


/** An example command that uses an example subsystem. */
public class ShooterSpeed50 extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final ShooterSubsystem shooterSubsystem;
double shooterSpeed = .5;
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public ShooterSpeed50(ShooterSubsystem shooterSubsystem) {
    this.shooterSubsystem = shooterSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(shooterSubsystem);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("<<Shooter Speed 50>>");

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
    shooterSubsystem.controlShooter(shooterSpeed);
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

