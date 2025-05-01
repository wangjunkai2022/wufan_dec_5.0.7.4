.class public final Lcom/wufan/user/service/protobuf/b0$b;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "RequestParameters.java"

# interfaces
.implements Lcom/wufan/user/service/protobuf/c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/wufan/user/service/protobuf/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lcom/wufan/user/service/protobuf/b0;",
        "Lcom/wufan/user/service/protobuf/b0$b;",
        ">;",
        "Lcom/wufan/user/service/protobuf/c0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/wufan/user/service/protobuf/b0;->V2()Lcom/wufan/user/service/protobuf/b0;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/wufan/user/service/protobuf/b0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/wufan/user/service/protobuf/b0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public V2()Lcom/wufan/user/service/protobuf/b0$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-static {v0}, Lcom/wufan/user/service/protobuf/b0;->e3(Lcom/wufan/user/service/protobuf/b0;)V

    return-object p0
.end method

.method public W2()Lcom/wufan/user/service/protobuf/b0$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-static {v0}, Lcom/wufan/user/service/protobuf/b0;->b3(Lcom/wufan/user/service/protobuf/b0;)V

    return-object p0
.end method

.method public X0()Lcom/wufan/user/service/protobuf/b0$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-static {v0}, Lcom/wufan/user/service/protobuf/b0;->X2(Lcom/wufan/user/service/protobuf/b0;)V

    return-object p0
.end method

.method public X2()Lcom/wufan/user/service/protobuf/b0$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-static {v0}, Lcom/wufan/user/service/protobuf/b0;->Z2(Lcom/wufan/user/service/protobuf/b0;)V

    return-object p0
.end method

.method public Y2(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/b0$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-static {v0, p1}, Lcom/wufan/user/service/protobuf/b0;->g3(Lcom/wufan/user/service/protobuf/b0;Ljava/lang/String;)V

    return-object p0
.end method

.method public Z2(Lcom/google/protobuf/ByteString;)Lcom/wufan/user/service/protobuf/b0$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-static {v0, p1}, Lcom/wufan/user/service/protobuf/b0;->Y2(Lcom/wufan/user/service/protobuf/b0;Lcom/google/protobuf/ByteString;)V

    return-object p0
.end method

.method public a()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/b0;->a()Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public a3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/b0$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-static {v0, p1}, Lcom/wufan/user/service/protobuf/b0;->d3(Lcom/wufan/user/service/protobuf/b0;Ljava/lang/String;)V

    return-object p0
.end method

.method public b()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/b0;->b()Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public b3(Lcom/google/protobuf/ByteString;)Lcom/wufan/user/service/protobuf/b0$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-static {v0, p1}, Lcom/wufan/user/service/protobuf/b0;->f3(Lcom/wufan/user/service/protobuf/b0;Lcom/google/protobuf/ByteString;)V

    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/b0;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c3(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/b0$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-static {v0, p1}, Lcom/wufan/user/service/protobuf/b0;->a3(Lcom/wufan/user/service/protobuf/b0;Ljava/lang/String;)V

    return-object p0
.end method

.method public d3(Lcom/google/protobuf/ByteString;)Lcom/wufan/user/service/protobuf/b0$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-static {v0, p1}, Lcom/wufan/user/service/protobuf/b0;->c3(Lcom/wufan/user/service/protobuf/b0;Lcom/google/protobuf/ByteString;)V

    return-object p0
.end method

.method public e3(I)Lcom/wufan/user/service/protobuf/b0$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-static {v0, p1}, Lcom/wufan/user/service/protobuf/b0;->W2(Lcom/wufan/user/service/protobuf/b0;I)V

    return-object p0
.end method

.method public getAppVersion()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/b0;->getAppVersion()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/b0;->getToken()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTokenBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/b0;->getTokenBytes()Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public getUid()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/b0;

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/b0;->getUid()I

    move-result v0

    return v0
.end method
