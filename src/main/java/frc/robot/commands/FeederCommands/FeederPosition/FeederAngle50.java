// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.FeederCommands.FeederPosition;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.FeederSubsystem;

public class FeederAngle50 extends Command {
  private FeederSubsystem feederSubsystem;
  double feederPosition = 50;


  /** Creates a new FeederAngle50. */
  public FeederAngle50() {
  addRequirements(feederSubsystem);

    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  System.out.println("<< Feeder Position 50 >>");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  feederSubsystem.FeederPID(feederPosition);
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
