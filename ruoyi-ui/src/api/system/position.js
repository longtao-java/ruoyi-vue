import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listPosition(query) {
  return request({
    url: '/system/position/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getPosition(id) {
  return request({
    url: '/system/position/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addPosition(data) {
  return request({
    url: '/system/position',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updatePosition(data) {
  return request({
    url: '/system/position',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delPosition(id) {
  return request({
    url: '/system/position/' + id,
    method: 'delete'
  })
}
