import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listNation(query) {
  return request({
    url: '/system/nation/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getNation(id) {
  return request({
    url: '/system/nation/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addNation(data) {
  return request({
    url: '/system/nation',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateNation(data) {
  return request({
    url: '/system/nation',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delNation(id) {
  return request({
    url: '/system/nation/' + id,
    method: 'delete'
  })
}
