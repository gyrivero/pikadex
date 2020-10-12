package com.cloudfoxgames.pikadex.retrofit.model;


public class VersionsEntity {
    /**
     * generationv : {"blackwhite":{}}
     * generationiii : {"fireredleafgreen":{},"rubysapphire":{},"emerald":{}}
     * generationiv : {"platinum":{},"diamondpearl":{},"heartgoldsoulsilver":{}}
     * generationvi : {"xy":{},"omegarubyalphasapphire":{}}
     * generationvii : {"ultrasunultramoon":{},"icons":{}}
     * generationii : {"gold":{},"crystal":{},"silver":{}}
     * generationi : {"redblue":{},"yellow":{}}
     * generationviii : {"icons":{}}
     */
    private GenerationvEntity generationv;
    private GenerationiiiEntity generationiii;
    private GenerationivEntity generationiv;
    private GenerationviEntity generationvi;
    private GenerationviiEntity generationvii;
    private GenerationiiEntity generationii;
    private GenerationiEntity generationi;
    private GenerationviiiEntity generationviii;

    public void setGenerationv(GenerationvEntity generationv) {
        this.generationv = generationv;
    }

    public void setGenerationiii(GenerationiiiEntity generationiii) {
        this.generationiii = generationiii;
    }

    public void setGenerationiv(GenerationivEntity generationiv) {
        this.generationiv = generationiv;
    }

    public void setGenerationvi(GenerationviEntity generationvi) {
        this.generationvi = generationvi;
    }

    public void setGenerationvii(GenerationviiEntity generationvii) {
        this.generationvii = generationvii;
    }

    public void setGenerationii(GenerationiiEntity generationii) {
        this.generationii = generationii;
    }

    public void setGenerationi(GenerationiEntity generationi) {
        this.generationi = generationi;
    }

    public void setGenerationviii(GenerationviiiEntity generationviii) {
        this.generationviii = generationviii;
    }

    public GenerationvEntity getGenerationv() {
        return generationv;
    }

    public GenerationiiiEntity getGenerationiii() {
        return generationiii;
    }

    public GenerationivEntity getGenerationiv() {
        return generationiv;
    }

    public GenerationviEntity getGenerationvi() {
        return generationvi;
    }

    public GenerationviiEntity getGenerationvii() {
        return generationvii;
    }

    public GenerationiiEntity getGenerationii() {
        return generationii;
    }

    public GenerationiEntity getGenerationi() {
        return generationi;
    }

    public GenerationviiiEntity getGenerationviii() {
        return generationviii;
    }
}