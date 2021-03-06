package civbot.util;

/**
 * Utility enum storing color codes and helpful methods.
 *
 * @author TechnoVision
 */
public enum EmbedColor {
    DEFAULT(0xFFFF00),
    ERROR(0xdd5f53),
    SUCCESS(0x77b255);

    public final int color;

    EmbedColor(int hexCode) {
        this.color = hexCode;
    }
}
