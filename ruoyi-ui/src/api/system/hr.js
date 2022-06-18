import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listHr(query) {
  return request({
    url: '/system/hr/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getHr(id) {
  return request({
    url: '/system/hr/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addHr(data) {
  return request({
    url: '/system/hr',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateHr(data) {
  return request({
    url: '/system/hr',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delHr(id) {
  return request({
    url: '/system/hr/' + id,
    method: 'delete'
  })
}
