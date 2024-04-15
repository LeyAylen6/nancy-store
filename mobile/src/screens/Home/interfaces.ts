import { BottomTabNavigationProp } from '@react-navigation/bottom-tabs';

export interface Product {
    id: string
    name: string
    price: number
    description: string
}

export type RootTabParamList = {
    Home: undefined;
    Detail: { productId: string };
};

type HomeTabNavigationProp = BottomTabNavigationProp<RootTabParamList, 'Home'>;

export interface HomeProps {
    navigation: HomeTabNavigationProp;
}
