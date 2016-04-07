package za.ac.cput.oop.domain;


import java.io.Serializable;

/**
 * Created by Ethon on 3/30/2016.
 */

public class EngineSizeEmbeddable implements Serializable{

    private String EngineSerialNumber;
    private String EngineSize;
    private String FuelType;

    private EngineSizeEmbeddable()
    {

    }

    public EngineSizeEmbeddable(Builder builder)
    {
        this.EngineSerialNumber = builder.EngineSerialNumber;
        this.EngineSize = builder.EngineSize;
        this.FuelType = builder.FuelType;
    }

    public String getEngineSerialNumber() {
        return EngineSerialNumber;
    }

    public String getEngineSize() {
        return EngineSize;
    }

    public String getFuelType() {
        return FuelType;
    }

    public static class Builder
    {
        private String EngineSerialNumber;
        private String EngineSize;
        private String FuelType;

        public Builder(String EngineSerialNumber)
        {
            this.EngineSerialNumber = EngineSerialNumber;
        }

        public Builder EngineSize(String EngineSize)
        {
            this.EngineSize = EngineSize;
            return this;
        }

        public Builder FuelType(String FuelType)
        {
            this.FuelType = FuelType;
            return this;
        }

        public Builder copy(EngineSizeEmbeddable engineSizeEmbeddable)
        {
            this.EngineSerialNumber = engineSizeEmbeddable.EngineSerialNumber;
            this.EngineSize = engineSizeEmbeddable.EngineSize;
            this.FuelType = engineSizeEmbeddable.FuelType;
            return this;
        }

        public EngineSizeEmbeddable build()
        {
            return new EngineSizeEmbeddable(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EngineSizeEmbeddable that = (EngineSizeEmbeddable) o;

        if (EngineSerialNumber != null ? !EngineSerialNumber.equals(that.EngineSerialNumber) : that.EngineSerialNumber != null)
            return false;
        if (EngineSize != null ? !EngineSize.equals(that.EngineSize) : that.EngineSize != null) return false;
        return FuelType != null ? FuelType.equals(that.FuelType) : that.FuelType == null;

    }

    @Override
    public int hashCode() {
        int result = EngineSerialNumber != null ? EngineSerialNumber.hashCode() : 0;
        result = 31 * result + (EngineSize != null ? EngineSize.hashCode() : 0);
        result = 31 * result + (FuelType != null ? FuelType.hashCode() : 0);
        return result;
    }
}
