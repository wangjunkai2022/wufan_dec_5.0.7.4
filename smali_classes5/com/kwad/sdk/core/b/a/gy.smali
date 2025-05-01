.class public final Lcom/kwad/sdk/core/b/a/gy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/kwad/sdk/core/d<",
        "Lcom/kwad/sdk/core/network/j;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lcom/kwad/sdk/core/network/j;Lorg/json/JSONObject;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "request_prepare_cost"

    .line 2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axd:J

    const-string v0, "request_add_params_cost"

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axe:J

    const-string v0, "request_create_cost"

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axf:J

    const-string v0, "keep_alive"

    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/network/j;->axg:I

    const-string v0, "dns_start"

    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axh:J

    const-string v0, "dns_cost"

    .line 7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axi:J

    const-string v0, "connect_establish_start"

    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axj:J

    const-string v0, "connect_establish_cost"

    .line 9
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axk:J

    const-string v0, "request_start"

    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axl:J

    const-string v0, "request_cost"

    .line 11
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axm:J

    const-string v0, "request_size"

    .line 12
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axn:J

    const-string v0, "response_start"

    .line 13
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axo:J

    const-string v0, "response_cost"

    .line 14
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axp:J

    const-string v0, "response_parse_cost"

    .line 15
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axq:J

    const-string v0, "response_size"

    .line 16
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axr:J

    const-string v0, "waiting_response_cost"

    .line 17
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axs:J

    const-string v0, "total_cost"

    .line 18
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axt:J

    const-string v0, "proxy_used"

    .line 19
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/network/j;->axu:I

    const-string v0, "request_id"

    .line 20
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/network/j;->axv:Ljava/lang/String;

    .line 21
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/sdk/core/network/j;->axv:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_1

    .line 22
    iput-object v1, p0, Lcom/kwad/sdk/core/network/j;->axv:Ljava/lang/String;

    :cond_1
    const-string v0, "has_data_v2"

    .line 23
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/network/j;->axw:I

    const-string v0, "result"

    .line 24
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/network/j;->result:I

    const-string v0, "response_done_cost"

    .line 25
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/network/j;->axx:J

    const-string v0, "host_ip"

    .line 26
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/network/j;->axy:Ljava/lang/String;

    .line 27
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/network/j;->axy:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 28
    iput-object v1, p0, Lcom/kwad/sdk/core/network/j;->axy:Ljava/lang/String;

    :cond_2
    const-string v0, "ip_type"

    .line 29
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/network/j;->axz:I

    const-string v0, "recommend_ping_time"

    .line 30
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/network/j;->axA:I

    const-string v0, "backup_ping_time"

    .line 31
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/network/j;->axB:I

    const-string v0, "other_ping_time"

    .line 32
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/core/network/j;->axC:I

    return-void
.end method

.method private static b(Lcom/kwad/sdk/core/network/j;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 6

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 3
    :cond_0
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axd:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    const-string v4, "request_prepare_cost"

    .line 4
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 5
    :cond_1
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axe:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_2

    const-string v4, "request_add_params_cost"

    .line 6
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 7
    :cond_2
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axf:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_3

    const-string v4, "request_create_cost"

    .line 8
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 9
    :cond_3
    iget v0, p0, Lcom/kwad/sdk/core/network/j;->axg:I

    if-eqz v0, :cond_4

    const-string v1, "keep_alive"

    .line 10
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 11
    :cond_4
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axh:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_5

    const-string v4, "dns_start"

    .line 12
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 13
    :cond_5
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axi:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_6

    const-string v4, "dns_cost"

    .line 14
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 15
    :cond_6
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axj:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_7

    const-string v4, "connect_establish_start"

    .line 16
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 17
    :cond_7
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axk:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_8

    const-string v4, "connect_establish_cost"

    .line 18
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 19
    :cond_8
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axl:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_9

    const-string v4, "request_start"

    .line 20
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 21
    :cond_9
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axm:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_a

    const-string v4, "request_cost"

    .line 22
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 23
    :cond_a
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axn:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_b

    const-string v4, "request_size"

    .line 24
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 25
    :cond_b
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axo:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_c

    const-string v4, "response_start"

    .line 26
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 27
    :cond_c
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axp:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_d

    const-string v4, "response_cost"

    .line 28
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 29
    :cond_d
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axq:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_e

    const-string v4, "response_parse_cost"

    .line 30
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 31
    :cond_e
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axr:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_f

    const-string v4, "response_size"

    .line 32
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 33
    :cond_f
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axs:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_10

    const-string v4, "waiting_response_cost"

    .line 34
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 35
    :cond_10
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axt:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_11

    const-string v4, "total_cost"

    .line 36
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 37
    :cond_11
    iget v0, p0, Lcom/kwad/sdk/core/network/j;->axu:I

    if-eqz v0, :cond_12

    const-string v1, "proxy_used"

    .line 38
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 39
    :cond_12
    iget-object v0, p0, Lcom/kwad/sdk/core/network/j;->axv:Ljava/lang/String;

    const-string v1, ""

    if-eqz v0, :cond_13

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    .line 40
    iget-object v0, p0, Lcom/kwad/sdk/core/network/j;->axv:Ljava/lang/String;

    const-string v4, "request_id"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    :cond_13
    iget v0, p0, Lcom/kwad/sdk/core/network/j;->axw:I

    if-eqz v0, :cond_14

    const-string v4, "has_data_v2"

    .line 42
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 43
    :cond_14
    iget v0, p0, Lcom/kwad/sdk/core/network/j;->result:I

    if-eqz v0, :cond_15

    const-string v4, "result"

    .line 44
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 45
    :cond_15
    iget-wide v4, p0, Lcom/kwad/sdk/core/network/j;->axx:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_16

    const-string v0, "response_done_cost"

    .line 46
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 47
    :cond_16
    iget-object v0, p0, Lcom/kwad/sdk/core/network/j;->axy:Ljava/lang/String;

    if-eqz v0, :cond_17

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    .line 48
    iget-object v0, p0, Lcom/kwad/sdk/core/network/j;->axy:Ljava/lang/String;

    const-string v1, "host_ip"

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    :cond_17
    iget v0, p0, Lcom/kwad/sdk/core/network/j;->axz:I

    if-eqz v0, :cond_18

    const-string v1, "ip_type"

    .line 50
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 51
    :cond_18
    iget v0, p0, Lcom/kwad/sdk/core/network/j;->axA:I

    if-eqz v0, :cond_19

    const-string v1, "recommend_ping_time"

    .line 52
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 53
    :cond_19
    iget v0, p0, Lcom/kwad/sdk/core/network/j;->axB:I

    if-eqz v0, :cond_1a

    const-string v1, "backup_ping_time"

    .line 54
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 55
    :cond_1a
    iget p0, p0, Lcom/kwad/sdk/core/network/j;->axC:I

    if-eqz p0, :cond_1b

    const-string v0, "other_ping_time"

    .line 56
    invoke-static {p1, v0, p0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    :cond_1b
    return-object p1
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/kwad/sdk/core/b;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/sdk/core/network/j;

    invoke-static {p1, p2}, Lcom/kwad/sdk/core/b/a/gy;->a(Lcom/kwad/sdk/core/network/j;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/kwad/sdk/core/b;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/sdk/core/network/j;

    invoke-static {p1, p2}, Lcom/kwad/sdk/core/b/a/gy;->b(Lcom/kwad/sdk/core/network/j;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
