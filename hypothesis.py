import hypothesis.strategies as st
from hypothesis import given

# Custom strategies for each piece of information
fornecedor_strategy = st.sampled_from(["Gold Energy", "MEO Energia", "Iberdrola", "Endesa","Galp Energia","Muon","EDAEnergia Simples","SU Electricidade","Coopernico","EDP Comercial","Luzboa","YIce","Enat"])
casa_strategy = st.text()
divisao_strategy = st.sampled_from(["Quarto", "Escritorio", "Sala de Estar", "Cozinha", "Garagem", "Jardim", "Casa de Banho"])
smartbulb_strategy = st.tuples(st.sampled_from(["Neutral", "Warm", "Cold"]), st.integers(min_value=1, max_value=20), st.floats(min_value=0.1, max_value=9.99))
smartcamera_strategy = st.tuples(st.sampled_from(["(1920x1080)", "(1280x720)", "(2160x1440)", "(1024x768)", "(3840x2160)", "(1366x768)"]), st.integers(min_value=1, max_value=120), st.floats(min_value=0.1, max_value=9.99))
smartspeaker_strategy = st.tuples(st.integers(min_value=1, max_value=100), st.text(), st.text(), st.floats(min_value=0.1, max_value=9.99))

# Combine strategies to form the log entry
log_entry_strategy = st.one_of(
    st.tuples(st.just("Fornecedor:"), fornecedor_strategy),
    st.tuples(st.just("Casa:"), casa_strategy),
    st.tuples(st.just("Divisao:"), divisao_strategy),
    st.tuples(st.just("SmartBulb:"), smartbulb_strategy),
    st.tuples(st.just("SmartCamera:"), smartcamera_strategy),
    st.tuples(st.just("SmartSpeaker:"), smartspeaker_strategy)
)

@given(log_entry_strategy)
def generate_log_entry(log_entry):
    log_entry_string = ''.join(map(str, log_entry))
    print(log_entry_string)
    assert log_entry_string.startswith(('Fornecedor:', 'Casa:', 'Divisao:', 'SmartBulb:', 'SmartCamera:', 'SmartSpeaker:'))


# Generate multiple log entries
generate_log_entry()  # You can specify the number of log entries to generate within the given() decorator, e.g., given(log_entry_strategy, max_examples=10)
