import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listEmployeetrain(query) {
  return request({
    url: '/system/employeetrain/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getEmployeetrain(id) {
  return request({
    url: '/system/employeetrain/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addEmployeetrain(data) {
  return request({
    url: '/system/employeetrain',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateEmployeetrain(data) {
  return request({
    url: '/system/employeetrain',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delEmployeetrain(id) {
  return request({
    url: '/system/employeetrain/' + id,
    method: 'delete'
  })
}
