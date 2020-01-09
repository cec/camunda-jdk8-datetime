package ch.lugano.egov.bpm.spin;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.camunda.spin.impl.json.jackson.format.JacksonJsonDataFormat;
import org.camunda.spin.spi.DataFormatConfigurator;

public class SpinDataFormatConfigurator implements DataFormatConfigurator<JacksonJsonDataFormat> {

    @Override
    public void configure(JacksonJsonDataFormat dataFormat) {
        dataFormat.setObjectMapper(
                dataFormat.getObjectMapper()
                        .registerModule(new Jdk8Module())
                        .registerModule(new JavaTimeModule())
                        .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
                        .configure(SerializationFeature.WRITE_DURATIONS_AS_TIMESTAMPS, false)
        );
    }

    @Override
    public Class<JacksonJsonDataFormat> getDataFormatClass() {
        return JacksonJsonDataFormat.class;
    }

}
