import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listEmployee(query) {
  return request({
    url: '/system/employee/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getEmployee(id) {
  return request({
    url: '/system/employee/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addEmployee(data) {
  return request({
    url: '/system/employee',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateEmployee(data) {
  return request({
    url: '/system/employee',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delEmployee(id) {
  return request({
    url: '/system/employee/' + id,
    method: 'delete'
  })
}
