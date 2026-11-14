package frc.robot.subsystems.shooter;

import org.littletonrobotics.junction.AutoLog;

public interface ShooterIO {
    @AutoLog
    public static class ShooterIOInputs {

        // flywheel
        boolean flywheelConnected = false;
        double flywheelStatorCurrent = 0.0;
        double flywheelSupplyCurrent = 0.0;
        double flywheelTemperature = 0.0;
        double flywheelTorqueCurrent = 0.0;
        double flywheelVelocity = 0.0;
        double flywheelReferenceVelocity = 0.0;
        double flywheelClosedLoopReferenceVelocity = 0.0;
        double flywheelCloseLoopReferenceError = 0.0;

        // hood
        boolean hoodConnected = false;
        double hoodStatorCurrent = 0.0;
        double hoodSupplyCurrent = 0.0;
        double hoodTemperature = 0.0;
        double hoodVoltage = 0.0;
        double hoodPosition = 0.0;
        double hoodReferencePosition = 0.0;
        double hoodClosedLoopReferencePosition = 0.0;
        double hoodClosedLoopReferenceError = 0.0;

    }

    public default void updateInputs(ShooterIOInputs inputs) {}

    // flywheel IO methods
    public default void setFlywheelVelocity(double velocityRPS) {}

    public default void setFlywheelCurrent(double amps) {}

    // hood IO methods
    public default void setHoodPosition(double position) {}

    public default void setHoodVoltage(double voltage) {}

    public default void zeroHoodPosition() {} // FIXME: determine what behavior this method has


}
