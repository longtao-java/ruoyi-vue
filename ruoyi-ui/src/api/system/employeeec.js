import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listEmployeeec(query) {
  return request({
    url: '/system/employeeec/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getEmployeeec(id) {
  return request({
    url: '/system/employeeec/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addEmployeeec(data) {
  return request({
    url: '/system/employeeec',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateEmployeeec(data) {
  return request({
    url: '/system/employeeec',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delEmployeeec(id) {
  return request({
    url: '/system/employeeec/' + id,
    method: 'delete'
  })
}
