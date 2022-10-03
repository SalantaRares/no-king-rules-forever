package com.mycompany.app.excel.model;

import com.mycompany.app.excel.export.ExcelGenerator;
import com.mycompany.app.excel.export.annotations.ExcelFormatOptions;
import com.mycompany.app.excel.export.annotations.ExcelIgnoreParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class IdExportClassExample implements Serializable {
    Date attributeDate;
    @ExcelFormatOptions(alignment = ExcelGenerator.LEFT_ALIGNMENT)
    String attributeString;
    @ExcelIgnoreParam
    String attributeString2;
}
