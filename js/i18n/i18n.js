import i18n from 'i18next';
import idiomaCastellano from './lenguajes/es/idiomaCastellano.json';
import idiomaGalego from './lenguajes/gl/idiomaGalego.json';

const languages_avaliable = [ 'es', 'gl'];

i18n.init({

    interpolation:{escapeValue: false},
    fallbackLng: languages_avaliable.includes(navigator.language) ? navigator.language : 'es', //Lenguaje por defecto

    resources: {
       
        es: {
            Vocabulary : idiomaCastellano,
        },
        gl: {
            Vocabulary: idiomaGalego,
        }
    }
});

export default i18n;