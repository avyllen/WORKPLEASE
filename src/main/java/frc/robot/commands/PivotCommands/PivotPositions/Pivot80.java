// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.PivotCommands.PivotPositions;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.PivotSubsystem;

public class Pivot80 extends Command {

  private final PivotSubsystem pivotSubsystem;
  double pivotPosition = 80;

  /** Creates a new Pivot50. */
  public Pivot80(PivotSubsystem pivotSubsystem) {
this.pivotSubsystem = pivotSubsystem;
addRequirements(pivotSubsystem);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("<<80 Degree Pivot>>");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    pivotSubsystem.PivotPID(pivotPosition);
    
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
