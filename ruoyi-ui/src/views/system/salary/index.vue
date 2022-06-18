<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="基本工资" prop="basicsalary">
        <el-input
          v-model="queryParams.basicsalary"
          placeholder="请输入基本工资"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="奖金" prop="bonus">
        <el-input
          v-model="queryParams.bonus"
          placeholder="请输入奖金"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="午餐补助" prop="lunchsalary">
        <el-input
          v-model="queryParams.lunchsalary"
          placeholder="请输入午餐补助"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="交通补助" prop="trafficsalary">
        <el-input
          v-model="queryParams.trafficsalary"
          placeholder="请输入交通补助"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="应发工资" prop="allsalary">
        <el-input
          v-model="queryParams.allsalary"
          placeholder="请输入应发工资"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="养老金基数" prop="pensionbase">
        <el-input
          v-model="queryParams.pensionbase"
          placeholder="请输入养老金基数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="养老金比率" prop="pensionper">
        <el-input
          v-model="queryParams.pensionper"
          placeholder="请输入养老金比率"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="启用时间" prop="createdate">
        <el-date-picker clearable
          v-model="queryParams.createdate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择启用时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="医疗基数" prop="medicalbase">
        <el-input
          v-model="queryParams.medicalbase"
          placeholder="请输入医疗基数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="医疗保险比率" prop="medicalper">
        <el-input
          v-model="queryParams.medicalper"
          placeholder="请输入医疗保险比率"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="公积金基数" prop="accumulationfundbase">
        <el-input
          v-model="queryParams.accumulationfundbase"
          placeholder="请输入公积金基数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="公积金比率" prop="accumulationfundper">
        <el-input
          v-model="queryParams.accumulationfundper"
          placeholder="请输入公积金比率"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="name">
        <el-input
          v-model="queryParams.name"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:salary:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:salary:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:salary:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:salary:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="salaryList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="${comment}" align="center" prop="id" />
      <el-table-column label="基本工资" align="center" prop="basicsalary" />
      <el-table-column label="奖金" align="center" prop="bonus" />
      <el-table-column label="午餐补助" align="center" prop="lunchsalary" />
      <el-table-column label="交通补助" align="center" prop="trafficsalary" />
      <el-table-column label="应发工资" align="center" prop="allsalary" />
      <el-table-column label="养老金基数" align="center" prop="pensionbase" />
      <el-table-column label="养老金比率" align="center" prop="pensionper" />
      <el-table-column label="启用时间" align="center" prop="createdate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.createdate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="医疗基数" align="center" prop="medicalbase" />
      <el-table-column label="医疗保险比率" align="center" prop="medicalper" />
      <el-table-column label="公积金基数" align="center" prop="accumulationfundbase" />
      <el-table-column label="公积金比率" align="center" prop="accumulationfundper" />
      <el-table-column label="${comment}" align="center" prop="name" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:salary:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:salary:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改【请填写功能名称】对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="基本工资" prop="basicsalary">
          <el-input v-model="form.basicsalary" placeholder="请输入基本工资" />
        </el-form-item>
        <el-form-item label="奖金" prop="bonus">
          <el-input v-model="form.bonus" placeholder="请输入奖金" />
        </el-form-item>
        <el-form-item label="午餐补助" prop="lunchsalary">
          <el-input v-model="form.lunchsalary" placeholder="请输入午餐补助" />
        </el-form-item>
        <el-form-item label="交通补助" prop="trafficsalary">
          <el-input v-model="form.trafficsalary" placeholder="请输入交通补助" />
        </el-form-item>
        <el-form-item label="应发工资" prop="allsalary">
          <el-input v-model="form.allsalary" placeholder="请输入应发工资" />
        </el-form-item>
        <el-form-item label="养老金基数" prop="pensionbase">
          <el-input v-model="form.pensionbase" placeholder="请输入养老金基数" />
        </el-form-item>
        <el-form-item label="养老金比率" prop="pensionper">
          <el-input v-model="form.pensionper" placeholder="请输入养老金比率" />
        </el-form-item>
        <el-form-item label="启用时间" prop="createdate">
          <el-date-picker clearable
            v-model="form.createdate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择启用时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="医疗基数" prop="medicalbase">
          <el-input v-model="form.medicalbase" placeholder="请输入医疗基数" />
        </el-form-item>
        <el-form-item label="医疗保险比率" prop="medicalper">
          <el-input v-model="form.medicalper" placeholder="请输入医疗保险比率" />
        </el-form-item>
        <el-form-item label="公积金基数" prop="accumulationfundbase">
          <el-input v-model="form.accumulationfundbase" placeholder="请输入公积金基数" />
        </el-form-item>
        <el-form-item label="公积金比率" prop="accumulationfundper">
          <el-input v-model="form.accumulationfundper" placeholder="请输入公积金比率" />
        </el-form-item>
        <el-form-item label="${comment}" prop="name">
          <el-input v-model="form.name" placeholder="请输入${comment}" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listSalary, getSalary, delSalary, addSalary, updateSalary } from "@/api/system/salary";

export default {
  name: "Salary",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 【请填写功能名称】表格数据
      salaryList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        basicsalary: null,
        bonus: null,
        lunchsalary: null,
        trafficsalary: null,
        allsalary: null,
        pensionbase: null,
        pensionper: null,
        createdate: null,
        medicalbase: null,
        medicalper: null,
        accumulationfundbase: null,
        accumulationfundper: null,
        name: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询【请填写功能名称】列表 */
    getList() {
      this.loading = true;
      listSalary(this.queryParams).then(response => {
        this.salaryList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        basicsalary: null,
        bonus: null,
        lunchsalary: null,
        trafficsalary: null,
        allsalary: null,
        pensionbase: null,
        pensionper: null,
        createdate: null,
        medicalbase: null,
        medicalper: null,
        accumulationfundbase: null,
        accumulationfundper: null,
        name: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加【请填写功能名称】";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getSalary(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改【请填写功能名称】";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateSalary(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addSalary(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除【请填写功能名称】编号为"' + ids + '"的数据项？').then(function() {
        return delSalary(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/salary/export', {
        ...this.queryParams
      }, `salary_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
