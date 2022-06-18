import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listLog(query) {
  return request({
    url: '/system/log/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getLog(msgid) {
  return request({
    url: '/system/log/' + msgid,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addLog(data) {
  return request({
    url: '/system/log',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateLog(data) {
  return request({
    url: '/system/log',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delLog(msgid) {
  return request({
    url: '/system/log/' + msgid,
    method: 'delete'
  })
}
