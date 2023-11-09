import { StatusBar } from 'expo-status-bar';
import { Button, StyleSheet, Text, TextInput, View ,Image} from 'react-native';
import { Header } from 'react-native-elements';

export default function App() {
   const IMAGENAME = require('./assets/image.png'); 

  return (
    <>
    <Header
    placement="left"
    centerComponent={{ text: 'Example 1', style: { color: '#fff', fontSize: 18 , padding:10} }}
  />
    <View style={styles.container}>
     
      <Image source={IMAGENAME} style={styles.Image} />
      <View style={styles.ButtonContainer} >
        <Button title='Button'/> 
        <Button title='Button'/> 
      </View>
        
      <View style={styles.ButtonContainer} >
        <Button title='Button'/> 
        <Button title='Button'/> 
      </View>
      
      <View style={styles.TextInputContainer} >
        <Text>Email</Text>
        <TextInput style={styles.TextInput} />
      </View>
    </View>
    </>
  );
}


const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'flex-start',
    paddingTop:60
  },
  ButtonContainer:{

    justifyContent :'space-around',
    alignItems: 'center',
    flexDirection:'row',
    width:'100%',
    margin:15
  },
  TextInputContainer:{
    justifyContent :'space-evenly',
    alignItems: 'center',
    flexDirection:'row',
    width:'100%',
    margin:15
  },
  TextInput :{
    borderColor:'black',
    borderBottomWidth:2,
    width: '60%',
    backgroundColor:"#EEE",
    padding:10
  },
  Image:{
    height: 200,
    width:200

  }

});
