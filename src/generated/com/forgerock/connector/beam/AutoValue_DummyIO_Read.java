

package com.forgerock.connector.beam;

import javax.annotation.Generated;
import org.apache.beam.sdk.coders.Coder;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_DummyIO_Read<ParameterT, OutputT> extends DummyIO.Read<ParameterT, OutputT> {

  private final DummyIO.RowMapper<OutputT> rowMapper;
  private final Coder<OutputT> coder;

  private AutoValue_DummyIO_Read(
       DummyIO.RowMapper<OutputT> rowMapper,
       Coder<OutputT> coder) {
    this.rowMapper = rowMapper;
    this.coder = coder;
  }

  @Override
  DummyIO.RowMapper<OutputT> getRowMapper() {
    return rowMapper;
  }

  @Override
  Coder<OutputT> getCoder() {
    return coder;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DummyIO.Read) {
      DummyIO.Read<?, ?> that = (DummyIO.Read<?, ?>) o;
      return ((this.rowMapper == null) ? (that.getRowMapper() == null) : this.rowMapper.equals(that.getRowMapper()))
           && ((this.coder == null) ? (that.getCoder() == null) : this.coder.equals(that.getCoder()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (rowMapper == null) ? 0 : rowMapper.hashCode();
    h$ *= 1000003;
    h$ ^= (coder == null) ? 0 : coder.hashCode();
    return h$;
  }

  @Override
  DummyIO.Read.Builder<ParameterT, OutputT> builder() {
    return new Builder<ParameterT, OutputT>(this);
  }

  static final class Builder<ParameterT, OutputT> extends DummyIO.Read.Builder<ParameterT, OutputT> {
    private DummyIO.RowMapper<OutputT> rowMapper;
    private Coder<OutputT> coder;
    Builder() {
    }
    private Builder(DummyIO.Read<ParameterT, OutputT> source) {
      this.rowMapper = source.getRowMapper();
      this.coder = source.getCoder();
    }
    @Override
    DummyIO.Read.Builder<ParameterT, OutputT> setRowMapper(DummyIO.RowMapper<OutputT> rowMapper) {
      this.rowMapper = rowMapper;
      return this;
    }
    @Override
    DummyIO.Read.Builder<ParameterT, OutputT> setCoder(Coder<OutputT> coder) {
      this.coder = coder;
      return this;
    }
    @Override
    DummyIO.Read<ParameterT, OutputT> build() {
      return new AutoValue_DummyIO_Read<ParameterT, OutputT>(
          this.rowMapper,
          this.coder);
    }
  }

}
