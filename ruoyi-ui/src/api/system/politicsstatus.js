import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listPoliticsstatus(query) {
  return request({
    url: '/system/politicsstatus/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getPoliticsstatus(id) {
  return request({
    url: '/system/politicsstatus/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addPoliticsstatus(data) {
  return request({
    url: '/system/politicsstatus',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updatePoliticsstatus(data) {
  return request({
    url: '/system/politicsstatus',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delPoliticsstatus(id) {
  return request({
    url: '/system/politicsstatus/' + id,
    method: 'delete'
  })
}
