.class public final Lcom/wufan/user/service/protobuf/a$b;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "ErrorMsg.java"

# interfaces
.implements Lcom/wufan/user/service/protobuf/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/wufan/user/service/protobuf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lcom/wufan/user/service/protobuf/a;",
        "Lcom/wufan/user/service/protobuf/a$b;",
        ">;",
        "Lcom/wufan/user/service/protobuf/b;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/wufan/user/service/protobuf/a;->V2()Lcom/wufan/user/service/protobuf/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/wufan/user/service/protobuf/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/wufan/user/service/protobuf/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public V2()Lcom/wufan/user/service/protobuf/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/a;

    invoke-static {v0}, Lcom/wufan/user/service/protobuf/a;->Z2(Lcom/wufan/user/service/protobuf/a;)V

    return-object p0
.end method

.method public W2(I)Lcom/wufan/user/service/protobuf/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/a;

    invoke-static {v0, p1}, Lcom/wufan/user/service/protobuf/a;->W2(Lcom/wufan/user/service/protobuf/a;I)V

    return-object p0
.end method

.method public X0()Lcom/wufan/user/service/protobuf/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/a;

    invoke-static {v0}, Lcom/wufan/user/service/protobuf/a;->X2(Lcom/wufan/user/service/protobuf/a;)V

    return-object p0
.end method

.method public X2(Ljava/lang/String;)Lcom/wufan/user/service/protobuf/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/a;

    invoke-static {v0, p1}, Lcom/wufan/user/service/protobuf/a;->Y2(Lcom/wufan/user/service/protobuf/a;Ljava/lang/String;)V

    return-object p0
.end method

.method public Y2(Lcom/google/protobuf/ByteString;)Lcom/wufan/user/service/protobuf/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/a;

    invoke-static {v0, p1}, Lcom/wufan/user/service/protobuf/a;->a3(Lcom/wufan/user/service/protobuf/a;Lcom/google/protobuf/ByteString;)V

    return-object p0
.end method

.method public getError()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/a;

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/a;->getError()I

    move-result v0

    return v0
.end method

.method public j()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/a;

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/a;->j()Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/user/service/protobuf/a;

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/a;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
