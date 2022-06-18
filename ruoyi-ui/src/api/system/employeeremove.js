import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listEmployeeremove(query) {
  return request({
    url: '/system/employeeremove/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getEmployeeremove(id) {
  return request({
    url: '/system/employeeremove/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addEmployeeremove(data) {
  return request({
    url: '/system/employeeremove',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateEmployeeremove(data) {
  return request({
    url: '/system/employeeremove',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delEmployeeremove(id) {
  return request({
    url: '/system/employeeremove/' + id,
    method: 'delete'
  })
}
