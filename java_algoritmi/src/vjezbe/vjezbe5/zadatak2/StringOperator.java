package vjezbe.vjezbe5.zadatak2;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringOperator {

    private Map<String, Operator> operatorMap = new LinkedHashMap<>();

    public StringOperator() {
        operatorMap.put("+", Operator.ADD);
        operatorMap.put("-", Operator.SUBTRACT);
        operatorMap.put("*", Operator.MULTIPLY);
        operatorMap.put("/", Operator.DIVIDE);
        operatorMap.put("^", Operator.EXPON);
    }

    public boolean isHigherPriority(String top, String ch) {
        boolean status;
        status = (operatorMap.containsKey(top)) && (operatorMap.get(top).getPriority() >=
                operatorMap.get(ch).getPriority());
        return status;
    }

    public Map<String, Operator> getOperatorMap() {
        return operatorMap;
    }
}
