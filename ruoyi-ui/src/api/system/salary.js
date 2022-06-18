import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listSalary(query) {
  return request({
    url: '/system/salary/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getSalary(id) {
  return request({
    url: '/system/salary/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addSalary(data) {
  return request({
    url: '/system/salary',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateSalary(data) {
  return request({
    url: '/system/salary',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delSalary(id) {
  return request({
    url: '/system/salary/' + id,
    method: 'delete'
  })
}
