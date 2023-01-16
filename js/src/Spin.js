import React from 'react';
import {Spin} from 'antd';
import {Icon} from "antd";

const getSpinIcon = () => <Icon type="loading" style={{fontSize: 24}} spin/>;

export const getSpin = () => (<div style={{
    display: 'flex',
    alignItems: 'center',
    justifyContent: 'center',
    height: '100vh',
}}><Spin size={"large"} indicator={getSpinIcon()}/></div>);

export default getSpin;