package ch.lugano.egov.bpm;


//import ch.lugano.egov.bpm.commons.AbstractDelegate;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;
import java.time.format.DateTimeFormatter;

@Named("parseOffsetDateTime")
//public class ParseOffsetDateTimeDelegate extends AbstractDelegate {
public class ParseOffsetDateTimeDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

    }

//    @Override
//    protected void run() throws Exception {
//        MyForm form = io.read("form", MyForm.class);
//        log(form.getDateTime().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
//    }

}
