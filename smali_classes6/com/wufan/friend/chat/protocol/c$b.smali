.class public final Lcom/wufan/friend/chat/protocol/c$b;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "AckArgs.java"

# interfaces
.implements Lcom/wufan/friend/chat/protocol/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/wufan/friend/chat/protocol/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lcom/wufan/friend/chat/protocol/c;",
        "Lcom/wufan/friend/chat/protocol/c$b;",
        ">;",
        "Lcom/wufan/friend/chat/protocol/d;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/wufan/friend/chat/protocol/c;->V2()Lcom/wufan/friend/chat/protocol/c;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/wufan/friend/chat/protocol/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/wufan/friend/chat/protocol/c$b;-><init>()V

    return-void
.end method


# virtual methods
.method public K()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/friend/chat/protocol/c;

    invoke-virtual {v0}, Lcom/wufan/friend/chat/protocol/c;->K()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public N()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/friend/chat/protocol/c;

    invoke-virtual {v0}, Lcom/wufan/friend/chat/protocol/c;->N()Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public O()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/friend/chat/protocol/c;

    invoke-virtual {v0}, Lcom/wufan/friend/chat/protocol/c;->O()J

    move-result-wide v0

    return-wide v0
.end method

.method public Q()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/friend/chat/protocol/c;

    invoke-virtual {v0}, Lcom/wufan/friend/chat/protocol/c;->Q()J

    move-result-wide v0

    return-wide v0
.end method

.method public V2()Lcom/wufan/friend/chat/protocol/c$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/friend/chat/protocol/c;

    invoke-static {v0}, Lcom/wufan/friend/chat/protocol/c;->X2(Lcom/wufan/friend/chat/protocol/c;)V

    return-object p0
.end method

.method public W2()Lcom/wufan/friend/chat/protocol/c$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/friend/chat/protocol/c;

    invoke-static {v0}, Lcom/wufan/friend/chat/protocol/c;->Z2(Lcom/wufan/friend/chat/protocol/c;)V

    return-object p0
.end method

.method public X0()Lcom/wufan/friend/chat/protocol/c$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/friend/chat/protocol/c;

    invoke-static {v0}, Lcom/wufan/friend/chat/protocol/c;->b3(Lcom/wufan/friend/chat/protocol/c;)V

    return-object p0
.end method

.method public X2(Ljava/lang/String;)Lcom/wufan/friend/chat/protocol/c$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/friend/chat/protocol/c;

    invoke-static {v0, p1}, Lcom/wufan/friend/chat/protocol/c;->a3(Lcom/wufan/friend/chat/protocol/c;Ljava/lang/String;)V

    return-object p0
.end method

.method public Y2(Lcom/google/protobuf/ByteString;)Lcom/wufan/friend/chat/protocol/c$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/friend/chat/protocol/c;

    invoke-static {v0, p1}, Lcom/wufan/friend/chat/protocol/c;->c3(Lcom/wufan/friend/chat/protocol/c;Lcom/google/protobuf/ByteString;)V

    return-object p0
.end method

.method public Z2(J)Lcom/wufan/friend/chat/protocol/c$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/friend/chat/protocol/c;

    invoke-static {v0, p1, p2}, Lcom/wufan/friend/chat/protocol/c;->W2(Lcom/wufan/friend/chat/protocol/c;J)V

    return-object p0
.end method

.method public a3(J)Lcom/wufan/friend/chat/protocol/c$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    check-cast v0, Lcom/wufan/friend/chat/protocol/c;

    invoke-static {v0, p1, p2}, Lcom/wufan/friend/chat/protocol/c;->Y2(Lcom/wufan/friend/chat/protocol/c;J)V

    return-object p0
.end method
