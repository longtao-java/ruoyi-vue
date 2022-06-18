import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listOplog(query) {
  return request({
    url: '/system/oplog/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getOplog(id) {
  return request({
    url: '/system/oplog/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addOplog(data) {
  return request({
    url: '/system/oplog',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateOplog(data) {
  return request({
    url: '/system/oplog',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delOplog(id) {
  return request({
    url: '/system/oplog/' + id,
    method: 'delete'
  })
}
