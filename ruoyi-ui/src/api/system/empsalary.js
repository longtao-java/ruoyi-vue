import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listEmpsalary(query) {
  return request({
    url: '/system/empsalary/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getEmpsalary(id) {
  return request({
    url: '/system/empsalary/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addEmpsalary(data) {
  return request({
    url: '/system/empsalary',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateEmpsalary(data) {
  return request({
    url: '/system/empsalary',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delEmpsalary(id) {
  return request({
    url: '/system/empsalary/' + id,
    method: 'delete'
  })
}
