package frc.robot.subsystems.arm;
import static frc.robot.subsystems.arm.ArmConstants.*;

import frc.lib.team6328.util.LoggedTunableNumber;

public class ArmIOTalonFX implements ArmIO {

    // tunables
    private final LoggedTunableNumber compliantLeftkP =
        new LoggedTunableNumber("Arm/CompliantLeft/kP", COMPLIANT_LEFT_KP);
    private final LoggedTunableNumber compliantLeftkI =
        new LoggedTunableNumber("Arm/CompliantLeft/kI", COMPLIANT_LEFT_KI);
    private final LoggedTunableNumber compliantLeftkD =
        new LoggedTunableNumber("Arm/CompliantLeft/kD", COMPLIANT_LEFT_KD);
    private final LoggedTunableNumber compliantLeftkS =
        new LoggedTunableNumber("Arm/CompliantLeft/kS", COMPLIANT_LEFT_KS);
    private final LoggedTunableNumber compliantLeftkV =
        new LoggedTunableNumber("Arm/CompliantLeft/kV", COMPLIANT_LEFT_KV);

    private final LoggedTunableNumber compliantRightkP =
        new LoggedTunableNumber("Arm/CompliantRight/kP", COMPLIANT_RIGHT_KP);
    private final LoggedTunableNumber compliantRightkI =
        new LoggedTunableNumber("Arm/CompliantRight/kI", COMPLIANT_RIGHT_KI);
    private final LoggedTunableNumber compliantRightkD =
        new LoggedTunableNumber("Arm/CompliantRight/kD", COMPLIANT_RIGHT_KD);
    private final LoggedTunableNumber compliantRightkS =
        new LoggedTunableNumber("Arm/CompliantRight/kS", COMPLIANT_RIGHT_KS);
    private final LoggedTunableNumber compliantRightkV =
        new LoggedTunableNumber("Arm/CompliantRight/kV", COMPLIANT_RIGHT_KV);

    private final LoggedTunableNumber rollerkP =
        new LoggedTunableNumber("Arm/Roller/kP", ROLLER_KP);
    private final LoggedTunableNumber rollerkI =
        new LoggedTunableNumber("Arm/Roller/kI", ROLLER_KI);
    private final LoggedTunableNumber rollerkD =
        new LoggedTunableNumber("Arm/Roller/kD", ROLLER_KD);
    private final LoggedTunableNumber rollerkS =
        new LoggedTunableNumber("Arm/Roller/kS", ROLLER_KS);
    private final LoggedTunableNumber rollerkV =
        new LoggedTunableNumber("Arm/Roller/kV", ROLLER_KV);

    private final LoggedTunableNumber wristkP =
        new LoggedTunableNumber("Arm/Wrist/kP", WRIST_KP);
    private final LoggedTunableNumber wristkI =
        new LoggedTunableNumber("Arm/Wrist/kI", WRIST_KI);
    private final LoggedTunableNumber wristkD =
        new LoggedTunableNumber("Arm/Wrist/kD", WRIST_KD);
    private final LoggedTunableNumber wristkS =
        new LoggedTunableNumber("Arm/Wrist/kS", WRIST_KS);
    private final LoggedTunableNumber wristkG =
        new LoggedTunableNumber("Arm/Wrist/kG", WRIST_KG);

    private final LoggedTunableNumber pivotkP =
        new LoggedTunableNumber("Arm/Pivot/kP", PIVOT_KP);
    private final LoggedTunableNumber pivotkI =
        new LoggedTunableNumber("Arm/Pivot/kI", PIVOT_KI);
    private final LoggedTunableNumber pivotkD =
        new LoggedTunableNumber("Arm/Pivot/kD", PIVOT_KD);
    private final LoggedTunableNumber pivotkS =
        new LoggedTunableNumber("Arm/Pivot/kS", PIVOT_KS);
    private final LoggedTunableNumber pivotkG =
        new LoggedTunableNumber("Arm/Pivot/kG", PIVOT_KG);
    private final LoggedTunableNumber pivotkA =
        new LoggedTunableNumber("Arm/Pivot/kA", PIVOT_KA);
    private final LoggedTunableNumber pivotKvExpo =
        new LoggedTunableNumber("Arm/Pivot/kG", PIVOT_KV_EXPO);
    private final LoggedTunableNumber pivotKaExpo =
        new LoggedTunableNumber("Arm/Pivot/kG", PIVOT_KA_EXPO);
}
