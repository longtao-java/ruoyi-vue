import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listAppraise(query) {
  return request({
    url: '/system/appraise/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getAppraise(id) {
  return request({
    url: '/system/appraise/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addAppraise(data) {
  return request({
    url: '/system/appraise',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateAppraise(data) {
  return request({
    url: '/system/appraise',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delAppraise(id) {
  return request({
    url: '/system/appraise/' + id,
    method: 'delete'
  })
}
