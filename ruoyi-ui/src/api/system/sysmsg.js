import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listSysmsg(query) {
  return request({
    url: '/system/sysmsg/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getSysmsg(id) {
  return request({
    url: '/system/sysmsg/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addSysmsg(data) {
  return request({
    url: '/system/sysmsg',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateSysmsg(data) {
  return request({
    url: '/system/sysmsg',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delSysmsg(id) {
  return request({
    url: '/system/sysmsg/' + id,
    method: 'delete'
  })
}
