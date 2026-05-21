package net.oneminus4.astrodyncore.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;

import net.oneminus4.astrodyncore.ASDCore;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;

public class ASDMaterials {

    public static Material Bakelite;

    public static void register() {

        Bakelite = new Material.Builder(ASDCore.id("bakelite"))
                .ingot()
                .flags(GENERATE_PLATE, DISABLE_DECOMPOSITION, DISABLE_MATERIAL_RECIPES)
                .formula("(C6H6O·CH2O)n", true)
                .color(0xE5B335).secondaryColor(0x99761A).iconSet(MaterialIconSet.SHINY)
                .buildAndRegister();
    }
}
