<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="员工姓名" prop="name">
        <el-input
          v-model="queryParams.name"
          placeholder="请输入员工姓名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="性别" prop="gender">
        <el-input
          v-model="queryParams.gender"
          placeholder="请输入性别"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="出生日期" prop="birthday">
        <el-date-picker clearable
          v-model="queryParams.birthday"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择出生日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="身份证号" prop="idcard">
        <el-input
          v-model="queryParams.idcard"
          placeholder="请输入身份证号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="民族" prop="nationid">
        <el-input
          v-model="queryParams.nationid"
          placeholder="请输入民族"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="籍贯" prop="nativeplace">
        <el-input
          v-model="queryParams.nativeplace"
          placeholder="请输入籍贯"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="政治面貌" prop="politicid">
        <el-input
          v-model="queryParams.politicid"
          placeholder="请输入政治面貌"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="邮箱" prop="email">
        <el-input
          v-model="queryParams.email"
          placeholder="请输入邮箱"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电话号码" prop="phone">
        <el-input
          v-model="queryParams.phone"
          placeholder="请输入电话号码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="联系地址" prop="address">
        <el-input
          v-model="queryParams.address"
          placeholder="请输入联系地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="所属部门" prop="departmentid">
        <el-input
          v-model="queryParams.departmentid"
          placeholder="请输入所属部门"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="职称ID" prop="joblevelid">
        <el-input
          v-model="queryParams.joblevelid"
          placeholder="请输入职称ID"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="职位ID" prop="posid">
        <el-input
          v-model="queryParams.posid"
          placeholder="请输入职位ID"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="聘用形式" prop="engageform">
        <el-input
          v-model="queryParams.engageform"
          placeholder="请输入聘用形式"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="所属专业" prop="specialty">
        <el-input
          v-model="queryParams.specialty"
          placeholder="请输入所属专业"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="毕业院校" prop="school">
        <el-input
          v-model="queryParams.school"
          placeholder="请输入毕业院校"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="入职日期" prop="begindate">
        <el-date-picker clearable
          v-model="queryParams.begindate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择入职日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="工号" prop="workid">
        <el-input
          v-model="queryParams.workid"
          placeholder="请输入工号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="合同期限" prop="contractterm">
        <el-input
          v-model="queryParams.contractterm"
          placeholder="请输入合同期限"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="转正日期" prop="conversiontime">
        <el-date-picker clearable
          v-model="queryParams.conversiontime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择转正日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="离职日期" prop="notworkdate">
        <el-date-picker clearable
          v-model="queryParams.notworkdate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择离职日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="合同起始日期" prop="begincontract">
        <el-date-picker clearable
          v-model="queryParams.begincontract"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择合同起始日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="合同终止日期" prop="endcontract">
        <el-date-picker clearable
          v-model="queryParams.endcontract"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择合同终止日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="工龄" prop="workage">
        <el-input
          v-model="queryParams.workage"
          placeholder="请输入工龄"
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
          v-hasPermi="['system:employee:add']"
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
          v-hasPermi="['system:employee:edit']"
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
          v-hasPermi="['system:employee:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:employee:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="employeeList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" :show-overflow-tooltip="true"/>
      <el-table-column label="员工编号" align="center" prop="id" :show-overflow-tooltip="true"/>
      <el-table-column label="员工姓名" align="center" prop="name" :show-overflow-tooltip="true" fixed="left"/>
      <el-table-column label="性别" align="center" prop="gender" :show-overflow-tooltip="true"/>
      <el-table-column label="出生日期" align="center" prop="birthday" width="180":show-overflow-tooltip="true">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.birthday, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="身份证号" align="center" prop="idcard" :show-overflow-tooltip="true"/>
      <el-table-column label="婚姻状况" align="center" prop="wedlock" :show-overflow-tooltip="true"/>
      <el-table-column label="民族" align="center" prop="nationid" :show-overflow-tooltip="true"/>
      <el-table-column label="籍贯" align="center" prop="nativeplace" :show-overflow-tooltip="true"/>
      <el-table-column label="政治面貌" align="center" prop="politicid" :show-overflow-tooltip="true"/>
      <el-table-column label="邮箱" align="center" prop="email" :show-overflow-tooltip="true"/>
      <el-table-column label="电话号码" align="center" prop="phone" :show-overflow-tooltip="true"/>
      <el-table-column label="联系地址" align="center" prop="address" :show-overflow-tooltip="true"/>
      <el-table-column label="所属部门" align="center" prop="departmentid" :show-overflow-tooltip="true"/>
      <el-table-column label="职称ID" align="center" prop="joblevelid" :show-overflow-tooltip="true"/>
      <el-table-column label="职位ID" align="center" prop="posid" :show-overflow-tooltip="true"/>
      <el-table-column label="聘用形式" align="center" prop="engageform" :show-overflow-tooltip="true"/>
      <el-table-column label="最高学历" align="center" prop="tiptopdegree" :show-overflow-tooltip="true"/>
      <el-table-column label="所属专业" align="center" prop="specialty" :show-overflow-tooltip="true"/>
      <el-table-column label="毕业院校" align="center" prop="school" :show-overflow-tooltip="true"/>
      <el-table-column label="入职日期" align="center" prop="begindate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.begindate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="在职状态" align="center" prop="workstate" :show-overflow-tooltip="true"/>
      <el-table-column label="工号" align="center" prop="workid" :show-overflow-tooltip="true"/>
      <el-table-column label="合同期限" align="center" prop="contractterm" :show-overflow-tooltip="true"/>
      <el-table-column label="转正日期" align="center" prop="conversiontime" width="180":show-overflow-tooltip="true">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.conversiontime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="离职日期" align="center" prop="notworkdate" width="180" :show-overflow-tooltip="true">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.notworkdate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="合同起始日期" align="center" prop="begincontract" width="180" :show-overflow-tooltip="true">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.begincontract, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="合同终止日期" align="center" prop="endcontract" width="180" :show-overflow-tooltip="true">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.endcontract, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="工龄" align="center" prop="workage" :show-overflow-tooltip="true"/>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width" width="120px" fixed="right">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:employee:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:employee:remove']"
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
        <el-form-item label="员工姓名" prop="name">
          <el-input v-model="form.name" placeholder="请输入员工姓名" />
        </el-form-item>
        <el-form-item label="性别" prop="gender">
          <el-input v-model="form.gender" placeholder="请输入性别" />
        </el-form-item>
        <el-form-item label="出生日期" prop="birthday">
          <el-date-picker clearable
            v-model="form.birthday"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择出生日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="身份证号" prop="idcard">
          <el-input v-model="form.idcard" placeholder="请输入身份证号" />
        </el-form-item>
        <el-form-item label="民族" prop="nationid">
          <el-input v-model="form.nationid" placeholder="请输入民族" />
        </el-form-item>
        <el-form-item label="籍贯" prop="nativeplace">
          <el-input v-model="form.nativeplace" placeholder="请输入籍贯" />
        </el-form-item>
        <el-form-item label="政治面貌" prop="politicid">
          <el-input v-model="form.politicid" placeholder="请输入政治面貌" />
        </el-form-item>
        <el-form-item label="邮箱" prop="email">
          <el-input v-model="form.email" placeholder="请输入邮箱" />
        </el-form-item>
        <el-form-item label="电话号码" prop="phone">
          <el-input v-model="form.phone" placeholder="请输入电话号码" />
        </el-form-item>
        <el-form-item label="联系地址" prop="address">
          <el-input v-model="form.address" placeholder="请输入联系地址" />
        </el-form-item>
        <el-form-item label="所属部门" prop="departmentid">
          <el-input v-model="form.departmentid" placeholder="请输入所属部门" />
        </el-form-item>
        <el-form-item label="职称ID" prop="joblevelid">
          <el-input v-model="form.joblevelid" placeholder="请输入职称ID" />
        </el-form-item>
        <el-form-item label="职位ID" prop="posid">
          <el-input v-model="form.posid" placeholder="请输入职位ID" />
        </el-form-item>
        <el-form-item label="聘用形式" prop="engageform">
          <el-input v-model="form.engageform" placeholder="请输入聘用形式" />
        </el-form-item>
        <el-form-item label="所属专业" prop="specialty">
          <el-input v-model="form.specialty" placeholder="请输入所属专业" />
        </el-form-item>
        <el-form-item label="毕业院校" prop="school">
          <el-input v-model="form.school" placeholder="请输入毕业院校" />
        </el-form-item>
        <el-form-item label="入职日期" prop="begindate">
          <el-date-picker clearable
            v-model="form.begindate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择入职日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="工号" prop="workid">
          <el-input v-model="form.workid" placeholder="请输入工号" />
        </el-form-item>
        <el-form-item label="合同期限" prop="contractterm">
          <el-input v-model="form.contractterm" placeholder="请输入合同期限" />
        </el-form-item>
        <el-form-item label="转正日期" prop="conversiontime">
          <el-date-picker clearable
            v-model="form.conversiontime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择转正日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="离职日期" prop="notworkdate">
          <el-date-picker clearable
            v-model="form.notworkdate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择离职日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="合同起始日期" prop="begincontract">
          <el-date-picker clearable
            v-model="form.begincontract"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择合同起始日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="合同终止日期" prop="endcontract">
          <el-date-picker clearable
            v-model="form.endcontract"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择合同终止日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="工龄" prop="workage">
          <el-input v-model="form.workage" placeholder="请输入工龄" />
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
import { listEmployee, getEmployee, delEmployee, addEmployee, updateEmployee } from "@/api/system/employee";

export default {
  name: "Employee",
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
      employeeList: [],
      // 弹出层标题
      title: "员工新增",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        name: null,
        gender: null,
        birthday: null,
        idcard: null,
        wedlock: null,
        nationid: null,
        nativeplace: null,
        politicid: null,
        email: null,
        phone: null,
        address: null,
        departmentid: null,
        joblevelid: null,
        posid: null,
        engageform: null,
        tiptopdegree: null,
        specialty: null,
        school: null,
        begindate: null,
        workstate: null,
        workid: null,
        contractterm: null,
        conversiontime: null,
        notworkdate: null,
        begincontract: null,
        endcontract: null,
        workage: null
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
      listEmployee(this.queryParams).then(response => {
        this.employeeList = response.rows;
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
        name: null,
        gender: null,
        birthday: null,
        idcard: null,
        wedlock: null,
        nationid: null,
        nativeplace: null,
        politicid: null,
        email: null,
        phone: null,
        address: null,
        departmentid: null,
        joblevelid: null,
        posid: null,
        engageform: null,
        tiptopdegree: null,
        specialty: null,
        school: null,
        begindate: null,
        workstate: null,
        workid: null,
        contractterm: null,
        conversiontime: null,
        notworkdate: null,
        begincontract: null,
        endcontract: null,
        workage: null
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
      getEmployee(id).then(response => {
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
            updateEmployee(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addEmployee(this.form).then(response => {
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
        return delEmployee(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/employee/export', {
        ...this.queryParams
      }, `employee_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
