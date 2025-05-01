.class Lcom/join/mgps/service/CommonService_$m0;
.super Ljava/lang/Object;
.source "CommonService_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/service/CommonService_;->N1(Ljava/lang/String;Lcom/join/mgps/dto/PayOrderInfo;Lcom/wufan/user/service/protobuf/n0;ZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/join/mgps/dto/PayOrderInfo;

.field final synthetic d:Lcom/wufan/user/service/protobuf/n0;

.field final synthetic e:Z

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Lcom/join/mgps/service/CommonService_;


# direct methods
.method constructor <init>(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;Lcom/join/mgps/dto/PayOrderInfo;Lcom/wufan/user/service/protobuf/n0;ZLjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/service/CommonService_$m0;->g:Lcom/join/mgps/service/CommonService_;

    iput-object p2, p0, Lcom/join/mgps/service/CommonService_$m0;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/join/mgps/service/CommonService_$m0;->c:Lcom/join/mgps/dto/PayOrderInfo;

    iput-object p4, p0, Lcom/join/mgps/service/CommonService_$m0;->d:Lcom/wufan/user/service/protobuf/n0;

    iput-boolean p5, p0, Lcom/join/mgps/service/CommonService_$m0;->e:Z

    iput-object p6, p0, Lcom/join/mgps/service/CommonService_$m0;->f:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService_$m0;->g:Lcom/join/mgps/service/CommonService_;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService_$m0;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/service/CommonService_$m0;->c:Lcom/join/mgps/dto/PayOrderInfo;

    iget-object v3, p0, Lcom/join/mgps/service/CommonService_$m0;->d:Lcom/wufan/user/service/protobuf/n0;

    iget-boolean v4, p0, Lcom/join/mgps/service/CommonService_$m0;->e:Z

    iget-object v5, p0, Lcom/join/mgps/service/CommonService_$m0;->f:Ljava/lang/String;

    invoke-static/range {v0 .. v5}, Lcom/join/mgps/service/CommonService_;->c2(Lcom/join/mgps/service/CommonService_;Ljava/lang/String;Lcom/join/mgps/dto/PayOrderInfo;Lcom/wufan/user/service/protobuf/n0;ZLjava/lang/String;)V

    return-void
.end method
