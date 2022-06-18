import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listJoblevel(query) {
  return request({
    url: '/system/joblevel/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getJoblevel(id) {
  return request({
    url: '/system/joblevel/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addJoblevel(data) {
  return request({
    url: '/system/joblevel',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateJoblevel(data) {
  return request({
    url: '/system/joblevel',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delJoblevel(id) {
  return request({
    url: '/system/joblevel/' + id,
    method: 'delete'
  })
}
