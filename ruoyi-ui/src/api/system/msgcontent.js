import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listMsgcontent(query) {
  return request({
    url: '/system/msgcontent/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getMsgcontent(id) {
  return request({
    url: '/system/msgcontent/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addMsgcontent(data) {
  return request({
    url: '/system/msgcontent',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateMsgcontent(data) {
  return request({
    url: '/system/msgcontent',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delMsgcontent(id) {
  return request({
    url: '/system/msgcontent/' + id,
    method: 'delete'
  })
}
