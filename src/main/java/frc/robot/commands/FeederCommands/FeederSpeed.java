// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.FeederCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.FeederSubsystem;

public class FeederSpeed extends Command {
   private final FeederSubsystem feederSubsystem;
   double feederSpeed = 0.8;

  /** Creates a new FeederSpeed. 
   * @param feederSubsystem */
  public FeederSpeed(FeederSubsystem feederSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.feederSubsystem = feederSubsystem;
    addRequirements(feederSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("<< Activating Feeder >>");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    feederSubsystem.controlFeeder(feederSpeed);
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
