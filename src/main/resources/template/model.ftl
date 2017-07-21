package demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ${model} implements Serializable {
<#assign keys = fields?keys>
<#list keys as key>
    private ${fields[key]} ${key};
</#list>
}