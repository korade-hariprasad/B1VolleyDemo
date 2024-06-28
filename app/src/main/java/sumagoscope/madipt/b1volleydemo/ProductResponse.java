
package sumagoscope.madipt.b1volleydemo;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProductResponse {

    private List<Product> products;
    private Integer total;
    private Integer skip;
    private Integer limit;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getSkip() {
        return skip;
    }

    public void setSkip(Integer skip) {
        this.skip = skip;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
