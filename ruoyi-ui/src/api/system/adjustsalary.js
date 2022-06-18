import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listAdjustsalary(query) {
  return request({
    url: '/system/adjustsalary/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getAdjustsalary(id) {
  return request({
    url: '/system/adjustsalary/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addAdjustsalary(data) {
  return request({
    url: '/system/adjustsalary',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateAdjustsalary(data) {
  return request({
    url: '/system/adjustsalary',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delAdjustsalary(id) {
  return request({
    url: '/system/adjustsalary/' + id,
    method: 'delete'
  })
}
