package com.degroni.everything_deco.common.block.properties;

import net.minecraft.world.level.material.MapColor;
import com.google.common.base.Preconditions;

public class EDMapColor {
    private static final EDMapColor[] MATERIAL_COLORS = new EDMapColor[64];
    public static final EDMapColor NONE = new EDMapColor(0, 0);
    public static final MapColor BLANCHED_NYLIUM = new MapColor(1, 7702909);
    public static final MapColor RIVERSTONE = new MapColor(2, 4344678);
    public static final MapColor DARKSTONE = new MapColor(3, 4539980);
    public static final MapColor CALCITE = new MapColor(4, 13224388);
    public static final MapColor TIN = new MapColor(5, 5924966);
    public static final MapColor BRONZE = new MapColor(6, 7820083);


    public final int col;
    public final int id;



    private EDMapColor(int id, int col) {
        if (id >= 0 && id <= 63) {
            this.id = id;
            this.col = col;
            MATERIAL_COLORS[id] = this;
        } else {
            throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
        }
    }

    public int calculateRGBColor(EDMapColor.Brightness brightness) {
        if (this == NONE) {
            return 0;
        } else {
            int i = brightness.modifier;
            int j = (this.col >> 16 & 255) * i / 255;
            int k = (this.col >> 8 & 255) * i / 255;
            int l = (this.col & 255) * i / 255;
            return -16777216 | l << 16 | k << 8 | j;
        }
    }

    public static EDMapColor byId(int id) {
        Preconditions.checkPositionIndex(id, MATERIAL_COLORS.length, "material id");
        return byIdUnsafe(id);
    }

    private static EDMapColor byIdUnsafe(int id) {
        EDMapColor edmapcolor = MATERIAL_COLORS[id];
        return edmapcolor != null ? edmapcolor : NONE;
    }

    public static int getColorFromPackedId(int packedId) {
        int i = packedId & 255;
        return byIdUnsafe(i >> 2).calculateRGBColor(EDMapColor.Brightness.byIdUnsafe(i & 3));
    }

    public byte getPackedId(EDMapColor.Brightness brightness) {
        return (byte)(this.id << 2 | brightness.id & 3);
    }

    public static enum Brightness {
        LOW(0, 180),
        NORMAL(1, 220),
        HIGH(2, 255),
        LOWEST(3, 135);

        private static final EDMapColor.Brightness[] VALUES = new EDMapColor.Brightness[]{LOW, NORMAL, HIGH, LOWEST};
        public final int id;
        public final int modifier;

        private Brightness(int id, int modifier) {
            this.id = id;
            this.modifier = modifier;
        }

        public static EDMapColor.Brightness byId(int id) {
            Preconditions.checkPositionIndex(id, VALUES.length, "brightness id");
            return byIdUnsafe(id);
        }

        static EDMapColor.Brightness byIdUnsafe(int id) {
            return VALUES[id];
        }
    }
}
