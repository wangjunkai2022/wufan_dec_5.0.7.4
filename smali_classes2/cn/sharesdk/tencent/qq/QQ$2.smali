.class Lcn/sharesdk/tencent/qq/QQ$2;
.super Ljava/lang/Object;
.source "QQ.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/tencent/qq/QQ;->doShare(Lcn/sharesdk/framework/Platform$ShareParams;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcn/sharesdk/framework/ShareSDKCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/Platform$ShareParams;

.field final synthetic b:Lcn/sharesdk/tencent/qq/utils/a;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Z

.field final synthetic i:I

.field final synthetic j:Ljava/lang/String;

.field final synthetic k:Ljava/lang/String;

.field final synthetic l:Ljava/lang/String;

.field final synthetic m:I

.field final synthetic n:Lcn/sharesdk/tencent/qq/QQ;


# direct methods
.method constructor <init>(Lcn/sharesdk/tencent/qq/QQ;Lcn/sharesdk/framework/Platform$ShareParams;Lcn/sharesdk/tencent/qq/utils/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/tencent/qq/QQ$2;->n:Lcn/sharesdk/tencent/qq/QQ;

    iput-object p2, p0, Lcn/sharesdk/tencent/qq/QQ$2;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    iput-object p3, p0, Lcn/sharesdk/tencent/qq/QQ$2;->b:Lcn/sharesdk/tencent/qq/utils/a;

    iput-object p4, p0, Lcn/sharesdk/tencent/qq/QQ$2;->c:Ljava/lang/String;

    iput-object p5, p0, Lcn/sharesdk/tencent/qq/QQ$2;->d:Ljava/lang/String;

    iput-object p6, p0, Lcn/sharesdk/tencent/qq/QQ$2;->e:Ljava/lang/String;

    iput-object p7, p0, Lcn/sharesdk/tencent/qq/QQ$2;->f:Ljava/lang/String;

    iput-object p8, p0, Lcn/sharesdk/tencent/qq/QQ$2;->g:Ljava/lang/String;

    iput-boolean p9, p0, Lcn/sharesdk/tencent/qq/QQ$2;->h:Z

    iput p10, p0, Lcn/sharesdk/tencent/qq/QQ$2;->i:I

    iput-object p11, p0, Lcn/sharesdk/tencent/qq/QQ$2;->j:Ljava/lang/String;

    iput-object p12, p0, Lcn/sharesdk/tencent/qq/QQ$2;->k:Ljava/lang/String;

    iput-object p13, p0, Lcn/sharesdk/tencent/qq/QQ$2;->l:Ljava/lang/String;

    iput p14, p0, Lcn/sharesdk/tencent/qq/QQ$2;->m:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 17

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcn/sharesdk/tencent/qq/QQ$2;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    move-object/from16 v5, p1

    invoke-virtual {v1, v5}, Lcn/sharesdk/framework/InnerShareParams;->setTitleUrl(Ljava/lang/String;)V

    .line 2
    iget-object v2, v0, Lcn/sharesdk/tencent/qq/QQ$2;->n:Lcn/sharesdk/tencent/qq/QQ;

    iget-object v3, v0, Lcn/sharesdk/tencent/qq/QQ$2;->b:Lcn/sharesdk/tencent/qq/utils/a;

    iget-object v4, v0, Lcn/sharesdk/tencent/qq/QQ$2;->c:Ljava/lang/String;

    iget-object v6, v0, Lcn/sharesdk/tencent/qq/QQ$2;->d:Ljava/lang/String;

    iget-object v7, v0, Lcn/sharesdk/tencent/qq/QQ$2;->e:Ljava/lang/String;

    iget-object v8, v0, Lcn/sharesdk/tencent/qq/QQ$2;->f:Ljava/lang/String;

    iget-object v9, v0, Lcn/sharesdk/tencent/qq/QQ$2;->g:Ljava/lang/String;

    iget-boolean v10, v0, Lcn/sharesdk/tencent/qq/QQ$2;->h:Z

    iget v11, v0, Lcn/sharesdk/tencent/qq/QQ$2;->i:I

    iget-object v12, v0, Lcn/sharesdk/tencent/qq/QQ$2;->j:Ljava/lang/String;

    iget-object v13, v0, Lcn/sharesdk/tencent/qq/QQ$2;->k:Ljava/lang/String;

    iget-object v14, v0, Lcn/sharesdk/tencent/qq/QQ$2;->l:Ljava/lang/String;

    iget v15, v0, Lcn/sharesdk/tencent/qq/QQ$2;->m:I

    iget-object v1, v0, Lcn/sharesdk/tencent/qq/QQ$2;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    move-object/from16 v16, v1

    invoke-static/range {v2 .. v16}, Lcn/sharesdk/tencent/qq/QQ;->a(Lcn/sharesdk/tencent/qq/QQ;Lcn/sharesdk/tencent/qq/utils/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/framework/Platform$ShareParams;)V

    return-void
.end method

.method public synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcn/sharesdk/tencent/qq/QQ$2;->a(Ljava/lang/String;)V

    return-void
.end method
