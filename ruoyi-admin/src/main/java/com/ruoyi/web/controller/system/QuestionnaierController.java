package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Questionnaier;
import com.ruoyi.system.service.IQuestionnaierService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 存储调查问卷数据Controller
 *
 * @author ruoyi
 * @date 2024-10-08
 */
@RestController
@RequestMapping("/system/questionnaier")
public class QuestionnaierController extends BaseController
{
    @Autowired
    private IQuestionnaierService questionnaierService;

    /**
     * 查询存储调查问卷数据列表
     */
//    @PreAuthorize("@ss.hasPermi('system:questionnaier:list')")
    @GetMapping("/list")
    public TableDataInfo list(Questionnaier questionnaier)
    {
        startPage();
        List<Questionnaier> list = questionnaierService.selectQuestionnaierList(questionnaier);
        return getDataTable(list);
    }

    /**
     * 导出存储调查问卷数据列表
     */
    @PreAuthorize("@ss.hasPermi('system:questionnaier:export')")
    @Log(title = "存储调查问卷数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Questionnaier questionnaier)
    {
        List<Questionnaier> list = questionnaierService.selectQuestionnaierList(questionnaier);
        ExcelUtil<Questionnaier> util = new ExcelUtil<Questionnaier>(Questionnaier.class);
        util.exportExcel(response, list, "存储调查问卷数据数据");
    }

    /**
     * 获取存储调查问卷数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:questionnaier:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(questionnaierService.selectQuestionnaierById(id));
    }

    /**
     * 新增存储调查问卷数据
     */
    @PreAuthorize("@ss.hasPermi('system:questionnaier:add')")
    @Log(title = "存储调查问卷数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Questionnaier questionnaier)
    {
        return toAjax(questionnaierService.insertQuestionnaier(questionnaier));
    }

    /**
     * 修改存储调查问卷数据
     */
    @PreAuthorize("@ss.hasPermi('system:questionnaier:edit')")
    @Log(title = "存储调查问卷数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Questionnaier questionnaier)
    {
        return toAjax(questionnaierService.updateQuestionnaier(questionnaier));
    }

    /**
     * 删除存储调查问卷数据
     */
    @PreAuthorize("@ss.hasPermi('system:questionnaier:remove')")
    @Log(title = "存储调查问卷数据", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(questionnaierService.deleteQuestionnaierByIds(ids));
    }
}
